package day1.oop

class Mobil {
    var model:String = ""
    var tipe:String = ""
    var jmlhPenumpang:Int = 0
    var ccMesin:Double = 0.0
    var harga:Double = 0.0

    fun detailMobil() {
        println("mobil $model bertipe $tipe mampu memuat $jmlhPenumpang orang, mobil seharga Rp $harga juta ini mempunyasi mesin sebesar $ccMesin L")
    }
}

fun main() {
    val mobil1 = Mobil()
    val mobil2 = Mobil()
    val mobil3 = Mobil()

    mobil1.model = "Innova Reborn"
    mobil1.tipe = "MPV"
    mobil1.jmlhPenumpang = 7
    mobil1.ccMesin = 2.4
    mobil1.harga = 498.0

    mobil2.model = "Porsche 911"
    mobil2.tipe = "Sport"
    mobil2.jmlhPenumpang = 2
    mobil2.ccMesin = 5.2
    mobil2.harga = 5350.9

    mobil3.model = "CRV"
    mobil3.tipe = "SUV"
    mobil3.jmlhPenumpang = 5
    mobil3.ccMesin = 2.0
    mobil3.harga = 685.0

    mobil2.detailMobil()
    mobil1.detailMobil()
    mobil3.detailMobil()
}