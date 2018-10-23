{
    var x={
        lastName : 'mahim',
        firstName : 'Ashraful',
        age : 25
    };

    document.getElementById('text').innerHTML=x.firstName + ' is ' +x.age+' years old.';
    console.log(0 +" is "+typeof 0);
    console.log("Ashraful is "+typeof "Ashraful");
    console.log(x.toLocaleString() +" is "+ typeof x);
}