Репозиторий: Генератор Единого Номера Полиса ОМС
---

Описание:

Метод в данном репозитории предназначен для генерации единого номера полиса обязательного медицинского страхования (ЕНП ОМС) в соответствии с установленными критериями.

Критерии генерации ЕНП ОМС:

Проверка правильности ввода единого номера полиса (ЕНП) обязательного медицинского страхования:

1-15: XXXXXXXXXXXXXXX

16: K

Единый номер полиса ОМС представляет собой шестнадцатиразрядное число, последний символ которого (K) является контрольным разрядом номера полиса ОМС, вычисляемым арифметически согласно методике расчета, описанной в международном стандарте ISO/HL7 27931:2009 (алгоритм Mod10).

Методика расчета контрольной цифры:

а) Выбираются нечетные цифры по порядку, начиная справа, и умножаются на 2.

б) Выбираются четные цифры по порядку, начиная справа, и результат приписывается слева от числа, полученного в пункте (а).

в) Складываются все цифры полученного в пункте (б) числа.

г) Полученное в пункте (в) число вычитается из ближайшего большего или равного числа, кратного 10. В результате получается искомая контрольная цифра.

Примечание: Данный репозиторий предоставляет инструменты для генерации правильных единых номеров полисов обязательного медицинского страхования, обеспечивая соответствие стандартам и требованиям ISO/HL7 27931:2009.
