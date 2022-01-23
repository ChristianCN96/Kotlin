fun main() {
    val subtotal = (60 * 0.30) + (100 * 0.25) + (20 * 80);
    val iva = subtotal * 0.16;
    val total = subtotal + iva;
    println(String.format("Total a pagar $%.2f ", total));

}