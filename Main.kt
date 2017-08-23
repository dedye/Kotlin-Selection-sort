fun <T:Comparable<T>>getSortingList(items:MutableList<T>):MutableList<T>{
    if (items.isEmpty()){
        return items
    }
    for (idx in 0..items.count()){
        val array = items.subList(0,items.count()-idx)
        val minItem = array.min()
        val indexOfMinItem = array.indexOf(minItem)

        if (minItem != null) {
            items.removeAt(indexOfMinItem)
            items.add(minItem)
        }
    }
    return items
}


fun main(args: Array<String>) {
    println("Masukan Nama yang akan di Sorting :")
    val names = mutableListOf("Jauhaf", "Dwike", "Indra", "Muhammad", "Rendi", "Dedye")
    println(names)
    var ordered = getSortingList(names)
    println("Data Nama yang sudah di Sorting :")
    println(ordered)
}