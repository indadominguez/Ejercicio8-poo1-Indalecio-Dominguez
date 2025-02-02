
class ConjuntoLibros(val capacidad: Int) {
    private val libros = arrayOfNulls<Libro>(capacidad)

    fun añadirLibro(libro: Libro): Boolean {
        for (i in libros.indices) {
            if (libros[i] == null) {
                libros[i] = libro
                return true
            }
        }
        return false
    }

    fun eliminarLibroPorTitulo(titulo: String): Boolean {
        for (i in libros.indices) {
            if (libros[i]?.titulo == titulo) {
                libros[i] = null
                return true
            }
        }
        return false
    }

    fun eliminarLibroPorAutor(autor: String): Boolean {
        for (i in libros.indices) {
            if (libros[i]?.autor == autor) {
                libros[i] = null
                return true
            }
        }
        return false
    }

    fun mostrarLibroMayorCalificacion(): Libro? {
        val librosNoNulos = libros.filterNotNull()
        return if (librosNoNulos.isNotEmpty()) {
            librosNoNulos.maxByOrNull { it.calificacion }
        } else {
            null
        }
    }

    fun mostrarLibroMenorCalificacion(): Libro? {
        val librosNoNulos = libros.filterNotNull()
        return if (librosNoNulos.isNotEmpty()) {
            librosNoNulos.minByOrNull { it.calificacion }
        } else {
            null
        }
    }

    fun mostrarContenido() {
        println("Contenido del conjunto de libros:")
        for (libro in libros) {
            libro?.let {
                println("${it.titulo} de ${it.autor} - Calificación: ${it.calificacion}")
            }
        }
    }
}
