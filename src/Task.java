/*
Вам необходимо доработать игру — гонки.
Игрок-пользователь соревнуется с противником, сгенерированным компьютером.
Победитель определяется по сравнению характеристик. Действуйте по пунктам:
1. Внимательно прочитайте код. Разберитесь, как он устроен.
2. Допечатайте все нужные характеристики — для этого нужно обратиться к полям класса.
Реализуйте методы:
1. Параметры авто игрока будут подгружаться из отдельного сервиса, хранение данных в котором отличается
от используемого в игре. Метод createCarByProperties(CarProperties carProperties), должен конвертировать
параметры в нужные типы и возвращает экземпляр класса Car.

2. Метод Integer getNitroLevel(int nitroLevel) должен возвращать значение nitroLevel.
Если nitroLevel равен нулю — тогда нужно вернуть null.
3. Метод makeRace(Car userCar, Car opponentCar, int distance) должен определять победителя и возвращать количество
полученных или проигранных очков:
  - Если гоночная дистанция — переменная distance —
  меньше или равна 15 километрам, то победителем объявляется тот игрок,
  у автомобиля которого больше ускорение — поле acceleration.

  - Если дистанция больше 50 километров, то выигрывает тот, у автомобиля которого наибольшая максимальная скорость — поле maxSpeed.

  -В случае победы игрока метод возвращает количество очков, равное наибольшему из максимальных скоростей участников.

  -Если по первому условию определить победителя не удалось, сравниваются ускорения игроков.
Если они равны, объявляется ничья и метод возвращает 0 очков.

  -Если и ничью определить не удалось, сравнивается уровень закиси азота.
Если он строго больше, то метод возвращает 0 очков. Если нет, метод возвращает -100 очков.

4. Метод changePointAndDistance(...) должен менять количество очков на переданный аргумент points и
увеличивать количество пройденных километров на аргумент distance.
 */
