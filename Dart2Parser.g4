
parser grammar Dart2Parser;

options { tokenVocab=Dart2Lexer; }

//program : def_class def_function_void def_function_datatype import
program : (def_class)* ;

content: varDefinition
        | varEQ
        | intIncrease
        | boolVarDefnition
        | boolVarEq
        | def_if
        | def_for
        | def_while
//        | defArray
        | def_switch
        | def_object
        | def_function_void
        | def_function_datatype
//        | defSet
//        | defMap
//        | assignOneElement
//        | defConst
//        | defFinal
//        | defLate
//        | defDynamic
//        | defEnum
        |print
        | widget
        | navigatorRule
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
    |  DOUBLE #  DOUBLE
    | SingleLineString # String  /// number
    | NULL_ # Null // NULL
     ;

boolExp : boolExp BooleanSign boolExp # BoolMathematicsLogic
        | OP boolExp CP # BoolBetweenBracket
        | Bool_value # Bool
        | IDENTIFIER # BoolVariable ;

value : SingleLineString |  DOUBLE | NUMBER  ;


print: PRINT OP (elements C*)* CP SC;
elements : value | IDENTIFIER;

//////////////////////////////////////
def_class:CLASS_ IDENTIFIER ( | EXTENDS_ IDENTIFIER ) ( | WITH_ (IDENTIFIER C*)*) OBC class_body*  CBC

;

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

// -- Object / Switch / Array / Set / Map / Const / Final / Late -- //
// -- Date :  1/1/2023 -- //

def_object : (DataType IDENTIFIER EQ NEW_ DataType OP (DataType IDENTIFIER C*)* CP SC)
           | (DataType IDENTIFIER EQ DataType OP (DataType IDENTIFIER C*)* CP SC)
           | (WIDGET IDENTIFIER EQ widget SC)
            ;

def_switch:
    SWITCH_ OP IDENTIFIER CP OBC (CASE_ value CO switch_body BREAK_ SC)*  (DEFAULT_ CO switch_body)* CBC;

switch_body:varDefinition
            |boolVarDefnition
            |intIncrease
            ;
//
//defArray:
//    DataType IDENTIFIER OB NUMBER CB EQ NEW_ DataType OB NUMBER* CB
//    |DataType IDENTIFIER OB NUMBER CB EQ OBC (value C*)* CBC
//    |DataType IDENTIFIER OB  NUMBER CB EQ OB (value C*)* CB
//    ;
//
//defSet : VAR_ IDENTIFIER EQ OB (value C*)* CB SC
//        |VAR_ IDENTIFIER EQ LT DataType GT OB (value C*)* CB SC
//        |SET_ ComparisonNormalVarSign DataType ComparisonNormalVarSign IDENTIFIER EQ OB (value C*)* CB SC
//        |FINAL_ IDENTIFIER EQ CONST_ OB (value C*)* CB SC
//        ;
//
//defMap : (VAR_ IDENTIFIER EQ OBC (value CO value C*)* CBC SC)
//        | (VAR_ IDENTIFIER EQ MAP_ LT DataType C DataType GT OB CB)
//;
//assignOneElement : IDENTIFIER OB value CB EQ value SC;
//
//defConst : CONST_ (varDefinition | boolVarDefnition | defArray)
//         | CONST_ IDENTIFIER (EQ exp |) SC;
//defFinal : FINAL_ (varDefinition | boolVarDefnition | defArray)
//         | FINAL_ IDENTIFIER (EQ exp |) SC;
//defLate :  LATE_ (varDefinition | boolVarDefnition | defArray)
//         | LATE_ IDENTIFIER (EQ exp |) SC;
//
//defDynamic : DYNAMIC_ IDENTIFIER (EQ exp |) SC;
//
//
//// -- Enum / Column / Row / ListView / TextField -- //
//// -- Date :  2/1/2023 -- //
//
//defEnum : (ENUM_ IDENTIFIER OBC (value C*)* CBC SC )
//;


widget : listView | defColumn | defRow | textField | text
| defContainer | image | defInkWell
;

defColumn : COLUMN_ OP layoutBody* CP C?;
defRow : ROW_ OP layoutBody* CP C?;
defContainer : CONTAINER_ OP containerBody* CP C?;

containerBody : CHILD_ CO (ComparisonNormalVarSign WIDGET ComparisonNormalVarSign)? (widget C*)?
               | PADDING_ CO PADDING_value C*
               | WIDTH_ CO NUMBER C*
;defInkWell : INKWELL_ OP inkWellBody* CP C?;

inkWellBody : CHILD_ CO (widget C*)?
               | ONPRESSED CO OP CP OBC content* CBC C*
;


listView : LISTVIEW_  OP listViewBody* CP C?;

listViewBody : layoutBody+
            | CONTROLLER CO IDENTIFIER C*
;


layoutBody : CHILDREN_ CO (ComparisonNormalVarSign WIDGET ComparisonNormalVarSign)? OB (widget C*)* CB C*

;

text: TEXT_ OP SingleLineString  CP C?;

textField: TextField OP (textFieldProperties)+ CP ;

textFieldProperties:textFieldTextProperty
                   | textFieldControllerProperty
                   | textFieldDecorationProperty
                   | textFieldOnChangedProperty
                   | textFieldOnEditingCompleteProperty
                   ;
textFieldTextProperty: TEXT CO SingleLineString ;

textFieldControllerProperty: CONTROLLER CO IDENTIFIER ;

textFieldDecorationProperty: DECORATION CO OP inputDecorationProperties+ CP ;


inputDecorationProperties:inputDecorationLabelTextProperty
                         | inputDecorationHintTextProperty
                         | inputDecorationHelperTextProperty
                         | inputDecorationIconProperty
                          ;
inputDecorationLabelTextProperty: LABELTEXT CO SingleLineString ;

inputDecorationHintTextProperty: HINTTEXT CO SingleLineString ;

inputDecorationHelperTextProperty: HELPERTEXT CO SingleLineString ;

inputDecorationIconProperty: ICON CO IDENTIFIER ;

textFieldOnChangedProperty: ONCHANGED CO IDENTIFIER ;

textFieldOnEditingCompleteProperty: ONEDITINGCOMPLETE CO IDENTIFIER;

// -- Image -- //
// -- Date :  3/1/2023 -- //

image : IMAGE_ OP assetImage C? (imageBody C*)* CP C*;
assetImage : IMAGE CO ASSETIMAGE_ OP SingleLineString CP ;
imageBody :  (WIDTH_ CO NUMBER C*)
           | (HEIGHT_ CO NUMBER C*)
 ;
 //Navigator.push(
 //    context,
 //    MaterialPageRoute(builder: (context) => const SecondRoute()),
 //  );
navigatorRule : Navigator OP Context_ C MaterialPageRoute_ OP Builder CO OP Context_ CP EG IDENTIFIER OP (DataType IDENTIFIER C*)* CP CP CP SC;






