package PRO4_FunctionParameter

fun main() {
    // FUNCTION PARAMETER
//    PARAMETER => data yang dikirim dari luar function
//    parameter ngga wajib, jumlah parameterpun tidak terbatas
//    dalam kotlin, default untuk parameter adalah VAL (immutable)

    //contoh
    sayHello("Fidah")
    sayHello("Helina")

    // null parameter
    profile("Fidah", 19, "Blue")
    profile("Helina", 20, null)
    //misal parameter boleh null, tetap harus diisi. tidak boleh dikosongkan
}

//contoh
fun sayHello(name:String){
    // name = "fidah" -> tidak bisa, karna default parameter adalah val, jadi tidak dapat diubah
    // dan parameter tidak dapat diubah kedalam var
    println("Hello $name")
}

fun profile(name: String, age:Int, color:String?) {
    //boleh menggunakan parameter yang boleh null

    if (color == null) println("Hello, my name is $name, I'm $age years old")
    else println("Hello, my name is $name, I'm $age years old, and my favorite color is $color")
}

// By Venonymous