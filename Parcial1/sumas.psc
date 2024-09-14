Algoritmo suma
	//Elabora un algoritmo que lea como dato de entrada un número menor a cien. Calcular la suma de los números entre 1 y dicho número. Imprimir el doble de la suma calculada.
	Imprimir "Dame un numero del 1 al 100"
	leer n
	Si num < 100 Entonces
		Para i=1 hasta n Hacer
			sumaa<-sumaa+i
		FinPara
	SiNo
		Imprimir "El numero debe de ser menor de 100"
	FinSi
	
	Imprimir "Resultado final: ", sumaa
FinAlgoritmo
