function activate(cat) {
    if (cat != 0) {
        document.getElementById('lihome').removeAttribute('class');
        document.getElementById('licat' + cat).setAttribute('class', 'active');
    } else document.getElementById('lihome').setAttribute('class', 'active');
    var cnt = 1, licat;
    while ((licat = document.getElementById('licat' + cnt)) != null) {
        if (cnt != cat) licat.removeAttribute('class'); cnt++;
    }
}