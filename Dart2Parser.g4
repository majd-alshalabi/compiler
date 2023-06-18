
parser grammar Dart2Parser;

options { tokenVocab=Dart2Lexer; }

program : (def_class)* ;

content: varDefinition      // done
        | varEQ             // done
        | intIncrease       // done
        | boolVarDefnition  // done
        | boolVarEq     // done
        | def_else      // done
        | def_else_if   // done
        | def_if        // done
        | def_for       // done
        | def_while     // done
        | def_switch    // done
        | def_function_void     // done
        | def_function_datatype // done
        | navigatorRule         // done
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
    | SingleLineString # String
     ;

boolExp : boolExp BooleanSign boolExp # BoolMathematicsLogic
        | OP boolExp CP # BoolBetweenBracket
        | Bool_value # Bool
        | IDENTIFIER # BoolVariable ;

value : SingleLineString |  DOUBLE | NUMBER  ;

//////////////////////////////////////
def_class:CLASS_ IDENTIFIER ( EXTENDS_ IDENTIFIER )? OBC class_body*  CBC

;

class_body:varDefinition
         |boolVarDefnition
         |def_build_function
         |def_function_datatype
         |def_function_void
         ;

def_function_void:VOID_ IDENTIFIER OP (DataType IDENTIFIER C*)* CP OBC content* CBC;
def_build_function:VOID_ Build OP CP OBC RETURN_ widget SC CBC;


def_function_datatype:DataType IDENTIFIER OP (DataType IDENTIFIER C*)* CP OBC content* RETURN_ exp SC CBC;

/// ************************************************** if



def_if:IF_ OP condition CP  OBC content* CBC;
def_else_if:ELSE_ IF_ OP condition CP  OBC content* CBC;
def_else: ELSE_ OBC content* CBC;



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

def_object : IDENTIFIER OP (IDENTIFIER CO exp C*)* CP ;

def_switch:
    SWITCH_ OP IDENTIFIER CP OBC switch_case* switch_defult? CBC;
switch_case:CASE_ value CO content* BREAK_ SC;
switch_defult : DEFAULT_ CO content*;

widget : listView |
        defColumn |  // done
           defRow |  // done
        textField |  // done
             text |  // done
     defContainer |  // done
            image |  // done
       defInkWell    // done
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

image : IMAGE_ OP assetImage C? (imageBody C*)* CP C*;
assetImage : IMAGE CO ASSETIMAGE_ OP SingleLineString CP ;
imageBody :  (WIDTH_ CO NUMBER C*)
           | (HEIGHT_ CO NUMBER C*)
 ;
navigatorRule : Navigator OP Context_ C MaterialPageRoute_ OP Builder CO OP Context_ CP EG def_object CP CP SC;






