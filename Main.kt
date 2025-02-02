
fun main() {
    val conjunto = ConjuntoLibros(5)

    val libro1 = Libro("Harry Potter", "J.K.Rowlling", 328, 9)
    val libro2 = Libro("El Hobbit", "J.R.R. Tolkien", 310, 8)

    conjunto.añadirLibro(libro1)
    conjunto.añadirLibro(libro2)

    println("Contenido después de añadir los libros:")
    conjunto.mostrarContenido()

    conjunto.eliminarLibroPorTitulo("Harry Potter")
    println("\nContenido después de eliminar el libro por título:")
    conjunto.mostrarContenido()

    conjunto.eliminarLibroPorAutor("J.R.R. Tolkien")
    println("\nContenido después de eliminar el libro por autor:")
    conjunto.mostrarContenido()

    val libro3 = Libro("Gerónimo Stilton", "Elisabetta Dami", 324, 10)
    conjunto.añadirLibro(libro3)

    println("\nContenido final después de añadir un nuevo libro:")
    conjunto.mostrarContenido()

    // Verificamos si hay más de un libro antes de mostrar los de mayor y menor calificación
    val libroMayorCalificacion = conjunto.mostrarLibroMayorCalificacion()
    val libroMenorCalificacion = conjunto.mostrarLibroMenorCalificacion()

    if (libroMayorCalificacion != null) {
        println("\nLibro con mayor calificación: ${libroMayorCalificacion.titulo}")
    } else {
        println("\nNo hay suficientes libros para determinar el de mayor calificación.")
    }

    if (libroMenorCalificacion != null) {
        println("Libro con menor calificación: ${libroMenorCalificacion.titulo}")
    } else {
        println("No hay suficientes libros para determinar el de menor calificación.")
    }
}

