fun rapot(nama: String, nilai: Int, rank: Int):String
{
    return "Nilai $nama Totalnya $nilai, Mendapatkan Ranking $rank"
}
fun lulus(nama: String, mtk: Int, big: Int, bin: Int, pkn: Int, apa: String):String{
    return "Siswa Bernama $nama, Dengan Deskripsi Nilai BErikut \nNilai MATEMATIKA \t:$mtk\nNilai Bahasa Inggris\t:$big\nNilai Bahasa Indonesia\t:$bin\nNilai PKN\t\t:$pkn\nDinyatakan \t\t:$apa"
    
}
fun main() {
    val bayu = lulus("bayu", 1, 1,1,1,"Tidak LULUS")
    println(bayu)
}
/////////////////////////

fun jumlah(nilaia: Int, nilaib: Int):Int
{
    return nilaia + nilaib
}
fun kurang(nilaia: Int, nilaib: Int):Int
{
    return nilaia - nilaib
}
fun kali(nilaia: Int, nilaib: Int):Int
{
    return nilaia * nilaib
}
fun bagi(nilaia: Int, nilaib: Int):Int
{
    return nilaia / nilaib
}
fun main() {
    val a = jumlah(8, 8)
    println(a)
    
    val b = kurang(8, 8)
    println(b)
    
    val c = kali(8, 4)
    println(c)
    
    val d = bagi(8, 4)
    println(d)
}

////////////
fun aaa(alas:Int, tinggi: Int):Double{
    
    return 0.5*alas*tinggi
}
fun main() {
    val a = aaa(128, 8)
    println(a)
    
   
}
