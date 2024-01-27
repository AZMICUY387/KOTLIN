//fungsi dengan return
fun barang(item : String):Int{
    return when (item){
    	"Baju" -> 150000
        "Celana" -> 250000
        "Sepaket" -> 350000
        else -> 0
    } 
}

fun diskon(harga: Int):Double{
    
    if(harga <= 199999){
        val diskon = harga * 0.05
    	val total = harga - diskon
        return total
	}
    else if(harga <= 299999){
        val diskon = harga * 0.10
    	val total = harga - diskon
        return total
	}
    else if(harga >=300000 ){
        val diskon = harga * 0.15
    	val total = harga - diskon
        return total
    }
    return 0.0
}

fun main() {
    val namabrgg = "Celana"
    val harga = barang(namabrgg)
    
    val total = diskon(harga)
    println("Terima Kasih Telah Berbelanja Di BAyu SHOPPP\nNama Barang\t:\t$namabrgg\nTOTAL \t\t:\t $total")
}