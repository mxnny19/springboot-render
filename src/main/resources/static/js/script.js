var n = window.prompt("Kida Jii?","vadiaa")
window.alert("Mai v "+ n)

// for(var i =0; i<10 ; i++)
// {
//     console.log(i);
// }
var person = {
    name: 'Manjosh',
    age: 20,
    email:'manjosh_badla@sfu.ca',
    address: {
        number: '13242',
        street: '70B AVE'
    },
    speak: function(words)
    {
        console.log(words)
    }
}

var a = 9

//functions 
function myfunc()
{
    console.log('hello world')
    console.log(a)
}

var myfunc2 = function(){
    console.log('hello world 2')
}

//callback
// function asc(a,b)
// {
//    return a-b 
// }

person.speak("hello")

window.addEventListener('keypress',processKey)

function processKey(evt)
{
    console.log(evt.key)
}

// var button = document.querySelector('input[value="SEND"]')
// button.addEventListener('click',function(evt))
// {
//     evt.preventDefault()
// } 