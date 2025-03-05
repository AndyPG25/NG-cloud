function calcularPrecio() {
    let horas = document.getElementById("usage").value;
    fetch("/api/calcular?horas=" + horas)
        .then(response => response.text())
        .then(data => document.getElementById("resultado").innerText = "Costo: $" + data);
}
