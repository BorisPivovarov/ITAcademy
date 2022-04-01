$(function () {
    let rubInCurrency;
    $('#findRubInCurrency').click(function () {
        let currencyType = $('#currentName').val();
        $.ajax({
            url: '/currency?code=' + currencyType,
            type: 'GET',
            success: function (data) {
                rubInCurrency = data.value;
                console.log('Текущий курс %s в рублях = %d', currencyType, rubInCurrency);
                $('#res').text('Курс: ' + rubInCurrency + ' рублей за 1 ' + currencyType);
            }
        })
    })
    $('#convertValue').click(function () {
        let cur;
        let currency = $('#currencyValue').val();
        if (!currency || isNaN(cur = parseFloat(currency)) || cur < 0) {
            $('#result').text('Произошла ошибка во время расчета');
            alert('Введенное значение некорректно, что приводит к невозможности произвести конвертацию');
            return;
        }
        $('#currencyValue').val(cur);
        cur = rubInCurrency * cur;
        console.log('Результат вычисления ' + cur + 'курс = ' + rubInCurrency);
        $('#result').text('Результат: ' + cur + ' рублей');
    })
});

