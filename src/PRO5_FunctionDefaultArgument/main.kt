package PRO5_FunctionDefaultArgument

fun main() {
    // FUNCTION DEFAULT ARGUMENT
//    Di kotlin, bisa memasukkan nilai default untuk parameter, jadi saat function dipanggil, tidak harus memasukan parameternya
//    Ketika function dipanggil namun tidak menyertakan parameternya, maka defaultnya yang akan dimasukkan

    hello("Hase")
    hello("Momy Pussie", "Black")
}

fun hello(name:String, color:String?=null){
    // = null -> default parameternya, ketika class dipanggil namun tidak menyertakan parameter ke 2,
// maka akan secara otomatis parameter ke 2 bernilai null/apapun yang menjadi defaultnya

    if (color == null) println("Hello, $name.")
    else println("Hello, $name. Your favorite color is $color")
}

// By Venonymous