Algoritmo tablas
	//Elabora un algoritmo que muestre las tablas del 11 al 20
	Imprimir "Dame un numero del 1 al 9 para poner su tabla del 11 al 20"
	leer n
	Si num < 10 Entonces
		Para i=11 hasta 20 Hacer
			imprimir n, " * ", i, " = ", n*i
		FinPara
	SiNo
		Imprimir "El numero debe de ser menor de 10"
	FinSi
FinAlgoritmo
