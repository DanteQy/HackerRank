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

function timeConversion(s) {
    let mm = s.slice(s.length-7,s.length-2);
    let hh = parseInt(s.slice(0, 2));
    let pam = s.slice(s.length-2, s.length); 
    
    if(pam == 'AM'){ if(hh == 12) hh = 0;  }
    else if(hh != 12) hh += 12; 
    if(hh < 10) hh = '0' + hh;
    
    return (hh +":"+mm);
}

function main() {
    var s = readLine();
    var result = timeConversion(s);
    process.stdout.write("" + result + "\n");

}
