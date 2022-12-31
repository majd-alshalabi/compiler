
parser grammar Dart2Parser;

options { tokenVocab=Dart2Lexer; }

program : content* ;
content: varDefinition
        | varEQ
        | intIncrease
        | boolVarDefnition
        | boolVarEq
        | def_if
        | def_for
        | def_while
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

def_function_void:VOID_ IDENTIFIER OP (DataType IDENTIFIER C*)* CP OBC content* CBC;


def_function_datatype:DataType IDENTIFIER OP (DataType IDENTIFIER C*)* CP OBC content* RETURN_ exp SC CBC;

/// ************************************************** if



def_if:IF_ OP condition CP  OBC ifContent CBC (ELSE_ IF_ OP condition CP  OBC elseIfContent CBC)* (ELSE_ OBC elseContent CBC)?;
ifContent : content*;
elseIfContent : content*;
elseContent : content*;



/// ***************************************************


/// ***************************************************** loops



def_for:FOR_ OP varDefinition  condition? SC for_Increment? CP OBC content* CBC;
for_Increment: IDENTIFIER (PLPL | MM) # for_Int_Increment
            | IDENTIFIER ((EQFORNORMALMATH | EQ) exp | )  # for_var_Eq
            ;
def_while:WHILE_ OP condition CP OBC content* CBC;


/// ********************************************************
condition: condition ComparisonSign condition # MultiCondition
        | exp ComparisonNormalVarSign exp # ComparisonBetweenTwoNormalVar
        | boolExp # ConditionBool ;



