# Head First Java — Contoh Latihan 



## Cara Kompilasi (dari folder proyek ini)
```bash
cd src
javac headfirst/ch01/*.java headfirst/ch02/*.java headfirst/ch05/*.java
```

## Cara Menjalankan
- Bab 1:
  - `java headfirst.ch01.MyFirstApp`
  - `java headfirst.ch01.BeerSong`
  - `java headfirst.ch01.PhraseOMatic`
  - `java headfirst.ch01.DooBee`
  - `java headfirst.ch01.Loopy`
  - `java headfirst.ch01.IfTest`
  - `java headfirst.ch01.IfTest2`

- Bab 2 (Guessing Game):
  - `java headfirst.ch02.GameLauncher`

- Bab 5/6 (SimpleDotCom — permainan konsol):
  - `java headfirst.ch05.SimpleDotComTestDrive`

> Catatan:
> - Seluruh kode berisi komentar pada setiap baris untuk memudahkan pembelajaran mandiri.
> - Versi Java: minimal Java 8. Tidak ada dependensi eksternal.

---
### Tambahan Bab
- `src/headfirst/ch03` : Primitive vs Reference, Array, Dog + TestDrive
- `src/headfirst/ch04` : Enkapsulasi (getter/setter), pass-by-value
- `src/headfirst/ch06` : Using Java Library (ArrayList, autoboxing)

#### Kompilasi tambahannya
```bash
cd src
javac headfirst/ch03/*.java headfirst/ch04/*.java headfirst/ch06/*.java
```
#### Menjalankan
```bash
java headfirst.ch03.PrimitiveRefDemo
java headfirst.ch03.ArrayIntro
java headfirst.ch03.DogTestDrive
java headfirst.ch04.DogEncapTest
java headfirst.ch04.PassByValue
java headfirst.ch06.ArrayListDog
```

### Bab 7–18 (tambahan)
- `src/headfirst/ch07` : Inheritance, overriding/overloading, IS-A & HAS-A (Vet).
  - Run: `java headfirst.ch07.InheritanceDemo`
- `src/headfirst/ch08` : Abstract class + Interface (Polymorphism).
  - Run: `java headfirst.ch08.PolymorphismDemo`
- `src/headfirst/ch09` : Constructor chaining, `super()`, eligible for GC.
  - Run: `java headfirst.ch09.ConstructorDemo`
- `src/headfirst/ch10` : Wrapper, autoboxing, DecimalFormat, DateTimeFormatter.
  - Run: `java headfirst.ch10.NumberFormatDemo`
- `src/headfirst/ch11` : Exception handling (try/multi-catch/finally), custom exception.
  - Run: `java headfirst.ch11.ExceptionDemo`
- `src/headfirst/ch12` : GUI Swing sederhana + animasi timer.
  - Run: `java headfirst.ch12.SimpleFrame`
- `src/headfirst/ch13` : Swing layout & widgets (JCheckBox, JTextField, JList).
  - Run: `java headfirst.ch13.SwingWidgetsDemo`
- `src/headfirst/ch14` : Serialization & File I/O (QuizCard save/load).
  - Run: `java headfirst.ch14.QuizCardIO`
- `src/headfirst/ch15` : Socket echo server + client (multithread).
  - Run server: `java headfirst.ch15.SimpleServer` | client: `java headfirst.ch15.SimpleClient`
- `src/headfirst/ch16` : Collections (Comparable/Comparator), equals/hashCode, Set uniqueness.
  - Run: `java headfirst.ch16.CollectionsDemo`
- `src/headfirst/ch17` : Packaging/JAR — file `MANIFEST.MF` disediakan.
  - Compile: `javac headfirst/ch17/HelloJar.java`
  - Buat JAR: `jar cfm hello.jar ../MANIFEST.MF headfirst/ch17/HelloJar.class`
  - Run: `java -jar hello.jar`
- `src/headfirst/ch18` : RMI minimal (HelloService) — butuh jalankan server & client.
  - Jalankan server (terminal 1): `java headfirst.ch18.HelloServer`
  - Jalankan client (terminal 2): `java headfirst.ch18.HelloClient`
  - Catatan: Pastikan `java.rmi` registry tersedia (kode akan mencoba membuat di port 1099).
