function calcule(){
    let altura = document.getElementById("altura").value;
    let peso = document.getElementById("peso").value;
    let resultado = document.getElementById("resultado");


if (peso && altura){
    let imc = (peso / (altura * altura)).toFixed(2);
    let classificação = "";

    if (imc < 18.9) classificação = "abaixo do peso";
    else if (imc < 24.9) classificação = "normal";
    else if (imc < 29.9) classificação = "sobrepeso";
    else if (imc < 34.9) classificação = "obsedidade grau 1";
    else if (imc < 39.9) classificação = "obesidade grau 2";
    else if(imc < 44.9) classificação = "obesidade grau 3";
    else if(imc > 45) classificação = "procure um medico";
    
    resultado.innerHTML = `seu imc é ${imc} ${classificação}`;
    }

    else{ 
        resultado.innerHTML = "insira todos os dados corretamene"
    }
}