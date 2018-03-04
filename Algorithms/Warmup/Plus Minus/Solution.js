process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function plusMinus(arr) {
    let neg= 0, pos = 0, zero= 0;
    for(i in arr){ 
        if(arr[i] < 0) neg++;
        if(arr[i] > 0) pos++;
        if(arr[i] == 0) zero++;
    } 
    
    console.log((pos/arr.length).toFixed(6)+"\n"+
                (neg/arr.length).toFixed(6)+"\n"+
                (zero/arr.length).toFixed(6));
}

function main() {
    var n = parseInt(readLine());
    arr = readLine().split(' ');
    arr = arr.map(Number);
    plusMinus(arr);

}
