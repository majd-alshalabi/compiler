class Login extends StatelessWidget {
  void build() {
    return Column(
      children: [
        Image(image: AssetImage("ttt.png")),
        Text("Login"),
        Row(children: [Text("email:"), TextField(controller: controlle1r),]),
        Row(children: [Text("password:"), TextField(controller: controlle1r),]),
        InkWell(onPressed: () {
          Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => Home(x:10))
          );
        }, child: Text("login")),
        InkWell(onPressed: () {
          Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => Register())
          );
        }, child: Text("register")),

      ],
    );
  }
}

class Register extends StatelessWidget {
  void build() {
    return Column(
      children: [
        Image(image: AssetImage("ttt.png")),
        Text("Register"),
        Row(children: [Text("Email:"), TextField(controller: controlle1r),]),
        Row(children: [Text("Name:"), TextField(controller: controlle1r),]),
        Row(children: [Text("Password:"), TextField(controller: controlle1r),]),
        InkWell(onPressed: () {
          Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => Home())
          );
        }, child: Text("Register")),
      ],
    );
  }
}

class Home extends StatelessWidget {
  void build() {
    return ListView(
      children: [
        Row(children: [
          Image(image: AssetImage("ttt.png")),
          Column(children: [Text("majd"), Text("hi every body")])
        ]),
        Row(children: [
          Image(image: AssetImage("ttt.png")),
          Column(children: [Text("majd"), Text("hi every body")])
        ]),
        Row(children: [
          Image(image: AssetImage("ttt.png")),
          Column(children: [Text("majd"), Text("hi every body")])
        ]),

        InkWell(onPressed: () {
          Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => Login())
          );
        }, child: Text("logout")),
        InkWell(onPressed: () {
          GetData(x);
        }, child: Text("show data")),

      ],
    );
  }
}

class majd {
  void hi(int x, int y) {
    int qaq = 1;
    int z = qaq;
  }
}
