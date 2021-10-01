import 'package:flutter/material.dart';
class LayoutRow extends StatelessWidget {
  const LayoutRow({Key? key}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
            appBar: AppBar(
              flexibleSpace: SafeArea(
                  // ignore: avoid_unnecessary_containers
                  child: Container(
                child: Column(
                  children: [
                    Row(
                      children: const [
                        IconButton(
                          icon: Icon(Icons.menu),
                          tooltip: 'Navigation menu',
                          onPressed: null, // null disables the button
                        ),
                        Spacer(),
                        Text(
                          'Kantin Politeknik Kampar',
                          textAlign: TextAlign.center,
                        ),
                        Spacer()
                      ],
                    )
                  ],
                ),
              )),
            ),
            // ignore: avoid_unnecessary_containers
            body: Container(
              child: Column(
                children: [
                  Row(
                    children: const [
                      Text(
                        'kolom Pertama baris Pertama',
                        textAlign: TextAlign.left,
                      ),
                      Spacer(),
                      Text(
                        'kolom kedua baris Pertama',
                        textAlign: TextAlign.center,
                      ),
                      Spacer(),
                      Text(
                        'kolom Ketiga baris Pertama',
                        textAlign: TextAlign.right,
                      ),
                    ],
                  ),
                  Row(
                    children: const [
                      Text(
                        'kolom Pertama baris kedua',
                        textAlign: TextAlign.left,
                      ),
                      Spacer(),
                      Text(
                        'kolom kedua baris kedua',
                        textAlign: TextAlign.center,
                      ),
                      Spacer(),
                      Text(
                        'kolom ketiga baris kedua',
                        textAlign: TextAlign.right,
                      ),
                    ],
                  ),
                ],
              ),
            )));
  }
}
void main() {
  runApp(LayoutRow());
}
