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
