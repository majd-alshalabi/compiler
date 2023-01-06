int x = 10 ;

Container(
  child:Column(
    children:[
      Image(image: AssetImage(""),
        width : 10,
        height : 10,
      ),
      Container(child:ListView(children:[]),),
      ListView(),
      Expanded(),
    ]
  ),
  width : 10,
  height : 10,
)