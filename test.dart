class MainClass {
  void main(int x, int y, String t) {
    Row(
      children: [
        Column(
          children: [
            Image(image : AssetImage("sdfsdf") , width : 10,),
            Text("whatsapp"),
            Text("Whatsapp desc."),
          ],
        ),
        Column(
          children: [
            Column(
              children: [
                Text("whatsapp"),
              ],
            ),
            Column(
              children: [
                Text("whatsapp"),
              ],
            ),
            Column(
              children: [
                Text("whatsapp"),
              ],
            ),
          ],
        ),
      ],
    )
  }
}