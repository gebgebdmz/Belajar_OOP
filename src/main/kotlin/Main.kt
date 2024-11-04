package org.example

var lakl: String? = null //harus dicek safe call operator
//dengan menggunakan lazy initialization, variabel tersebut baru akan diinisialisasi ketika benar-benar dibutuhkan saja.
lateinit var akl: String//pendekatan kedua untuk inisiasi dengan nilai awal null, inisialisasi pada ara ini ditunda, isi bisa dirubah ketika dipakai
val names: String by lazy {
    "Dicoding Miaw"
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //object everywhere, object bernama someString menggunakan kelas String (berisi fungsi dan properti)
    //fungsi pada String seperti reversed(), uppercase() dsb
//    val someString = "Dicoding"
//    println(someString.reversed())
//    println(someString.uppercase())
//    println(someString.lowercase())

//    val someString2 = "123"
//    val someInt = someString2.toInt()
//    val someOtherString = "12.34"
//    val someDouble = someOtherString.toDouble()

    //kelas
    //membuat objek dari kelas Animal
    val dicodingCat = Animal()
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
//    dicodingCat.eat()
//    dicodingCat.sleep()
//
//// Mengubah Properti dari class dicodingCat, bisa berubah properti nya karena dibikin var
//    dicodingCat.name = "Kucing Oren"
//    dicodingCat.weight = 6.0
//    dicodingCat.age = 3
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
//    dicodingCat.eat()
//    dicodingCat.sleep()
//    println("Nama: ${dicodingCat.name}" )
//    dicodingCat.name = "Goose"
//    println("Nama: ${dicodingCat.name}")

    val dicodingCat2 = Animal2()
    //setter getter ubah manual
//    println("Nama: ${dicodingCat2.name}" )
//    dicodingCat2.name = "hahaha"
//    println("Nama: ${dicodingCat2.name}")
//    println(someInt is Int)
//    println(someDouble is Double)

    //Lateinit dan Lazy Property
    //lateinit
//    lakl = "Dicoding Miaw"
//    akl = "Dicoding Miaw"
//    println("Cara 1 " + lakl?.length) //ngecek apakah null ato tidk karena diisi nya null diatas
//    println("Cara 2 " + akl?.length) //lateinit, ngecek apakah null ato tidk karena diisi nya null diatas
//
//    if (::akl.isInitialized) // mengecek apakah sudah diinisialisasi (sudah bukan null) ato belum
//        print(akl.length)
//    else
//        print("Not Initialized")

    //lazy property
    print(names.length)
}

    //kelas
class Animal(){
    //4 properti,var bisa berubah2 nilai nya sedangkan val read only
        var name: String = "Kucing"
        var weight: Double = 3.2
        var age: Int = 2
        var isMammal: Boolean = true
    //2 method

        fun eat(){
            println("$name makan!")
        }
        fun sleep() {
            println("$name tidur!")
        }
}

class Animal2 (){ //kalo setter getter gini gabisa masukin fun dsb
    var name: String = "Whakee hhh"
    get(){
        println("Fungsi Getter terpanggil")
        return field
    }
    set(value){
        println("Fungsi Setter terpanggil")
        field = value
    }
}