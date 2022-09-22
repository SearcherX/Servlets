//делегировать всем элементам класса input-number проверку на ввод правильного числа
document.addEventListener('keypress', evt => {
    if (evt.target.closest('.input-number')) {
        if (!/[0-9.]/.test(evt.key))
            evt.preventDefault()
    }
})