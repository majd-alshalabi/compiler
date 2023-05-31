class MainApp extends StatelessWidget {
  int x;

  void build() {
    Row(
      children: [
        Column(
          children: [
            TextField(controller : controlle1r),
            InkWell(onPressed:(){
            Navigator.push(context,MaterialPageRoute(builder: (context) => MainApp3()));
            },child:Text("click me.")),
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

class MainApp2 extends StatelessWidget {
  void build() {
    Row(
      children: [
        Text("majd alshalabi"),
        Text("majd alshalabi2"),
      ],
    )
  }
}

class MainApp3 extends StatelessWidget {
  void build() {
    Row(
      children: [
        Text("majd alshalabi"),
        Text("majd alshalabi2"),
      ],
    )
  }
}