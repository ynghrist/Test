let equation = '';

function mainbutton(value) {
    equation += value;
    document.getElementById('display').value = equation;
}

function result() {
    const result = eval(equation);
    equation = '';
    document.getElementById('display').value = result;
}

function clearall() {
    equation = '';
    document.getElementById('display').value = '';
} 