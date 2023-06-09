class MainApp extends StatelessWidget  {
  void build() {
    return Row(
      children: [
        Column(
          children: [
            Image(image: AssetImage("ttt.png")),
            TextField(controller: controlle1r),
            InkWell(onPressed: () {
              int x = 2;
              if (x == 1) {
                Navigator.push(
                    context,
                    MaterialPageRoute(builder: (context) => MainApp2())
                );
              } else {
                Navigator.push(
                    context,
                    MaterialPageRoute(builder: (context) => MainApp3(x : 10))
                );
              }
            }, child: Text("click me.")),
            Text("click the upper button"),
          ],
        ),
        Column(
          children: [
            Column(
              children: [
                Text("hi."),
              ],
            ),
            Column(
              children: [
                Text("how are you ? "),
              ],
            ),
            Column(
              children: [
                Text("fine ?!!"),
              ],
            ),
          ],
        ),
      ],
    );
  }
}
class MainApp5  {
}

class MainApp2 extends StatelessWidget  {
  void build() {
    return Row(
      children: [
        Text("majd alshalabi"),
        Text("majd alshalabi2"),
      ],
    );
  }
}

class MainApp3 extends StatelessWidget  {
  void build() {
    return Row(
      children: [
        Text("majd alshalabi"),
        Text("majd alshalabi2"),
      ],
    );
  }
}

class majd{
  int x = 1;
  void hi(int x , int y){}
  double majdss(int x , int xxx){return "majd" ;}
}
