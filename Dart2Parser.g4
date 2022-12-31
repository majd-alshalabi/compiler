
parser grammar Dart2Parser;

options { tokenVocab=Dart2Lexer; }

program : content*;
content: varDefinition
        | varEQ
        | intIncrease
        | boolVarDefnition
        | boolVarEq
        | def_if
        ;
// (varDefnition | varEq | boolVarDefnition | boolVarEq)*;
varDefinition: DataType IDENTIFIER (EQ exp |) SC ;
intIncrease: IDENTIFIER (PLPL | MM)  SC ;
boolVarDefnition: Bool_type IDENTIFIER (EQ boolExp | ) SC ;
varEQ : IDENTIFIER ((EQFORNORMALMATH | EQ) exp | ) SC;
boolVarEq : IDENTIFIER ((EQFORBOOLEANMATH | EQ) boolExp | ) SC;
exp : exp MathMaticalSign exp # MathematicsLogic /// math between expression
    | OP exp CP # BetweenBracket /// expression in brackets
    | IDENTIFIER # Variable /// variable
    | NUMBER # Number
    | DOUBLE # Double
    | SingleLineString # String;  /// number
boolExp : boolExp BooleanSign boolExp # BoolMathematicsLogic
        | OP boolExp CP # BoolBetweenBracket
        | Bool_value # Bool
        | IDENTIFIER # BoolVariable ;
//////////////////////////////////////
def_class:CLASS_ IDENTIFIER ( | EXTENDS_ IDENTIFIER ) OBC class_body*  CBC;

class_body:varDefinition
         |boolVarDefnition
         |def_function_datatype
         |def_function_void
         ;

def_function_void:VOID_ IDENTIFIER OP (DataType IDENTIFIER C*)* CP OBC function_body* CBC;


def_function_datatype:DataType IDENTIFIER OP (DataType IDENTIFIER C*)* CP OBC function_body* RETURN_ IDENTIFIER SC CBC;
function_body:varDefinition
             |boolVarDefnition
             |intIncrease
             ;
def_if:IF_ OP condition CP  OBC ifContent CBC (ELSE_ IF_ OP condition CP  OBC elseIfContent CBC)* (ELSE_ OBC elseContent CBC)?;
ifContent :  (varDefinition
            | varEQ
            | intIncrease
            | boolVarDefnition
            | boolVarEq
            | def_if)*
            ;
elseIfContent : content*;
elseContent : content*;
condition: condition ComparisonSign condition # MultiCondition
        | exp ComparisonNormalVarSign exp # ComparisonBetweenTwoNormalVar
        | boolExp # ConditionBool ;


