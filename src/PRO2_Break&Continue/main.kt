package `PRO2_Break&Continue`

fun main() {
    //BREAK DAN CONTINUE
//    adalah katakunci yang bisa digunakan dalam semua perulangan dikotlin
//    Break digunakan untuk menghentikan seluruh perulangan
//    Continue digunakan untuk menghentikan perulangan yang berjalan, dan melanjutkan ke perulangan berikutnya

//    perulangan{
//      break
//    }
    var i = 0
    while (true){
        println("while break ke-$i")
        i++
        if (i > 10){
            println("Stop loops with BREAK\n")
            break
        }
    }

//    continue
//    perulangan{
//      continue
//    }
    for (a in 0..100){
        if (a % 2 == 0){
            continue
        }
        println("For continue ke-$a")
    }
}

// By Venonymous