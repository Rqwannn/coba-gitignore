fun PrintName(Name: String, Age: Int) : String{
    return "Nama Anda Adalah ${Name}, Usia : ${Age}"
}

fun main(){
    val Name: String = "Muhammad Raqwan"
    val Age : Int = 16
    var Hasil = PrintName(Name, Age)

    if(Name.toLowerCase() == "muhammad raqwan"){
        println(Hasil)
    }

    val Benar: Char = 'Y'
    val Salah: Char = 'N'

    var cekValue: Boolean = true

    while (cekValue){
        print("Ingin Menguji Loop?(Y/N: ")
        var stringInput = readLine()!!

        if(stringInput.toLowerCase() == "y"){
            println("Anda telah menjalankan looping")

            print("Ingin Mengulang Loop?(Y/N: ")
            var stringInput = readLine()!!

            if(stringInput.toLowerCase() == "y"){
                println("Terima Kasih telang mengulang, looping sudah batas")
                break
            } else if(stringInput.toLowerCase() == "n"){
                println("Anda telah menyelesaikan looping")
                break
            }
        } else if(stringInput.toLowerCase() == "n"){
            println("Anda telah menyelesaikan looping")
            break
        }
    }
}