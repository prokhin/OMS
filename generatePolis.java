  public static String generatePolisNumbFix() {
    Random random = new Random();
    StringBuilder policyNumber = new StringBuilder();

    // Генерация первых 15 цифр номера полиса
    for (int i = 0; i < 15; i++) {
      int digit = random.nextInt(10); // Генерация случайной цифры от 0 до 9
      policyNumber.append(digit);
    }

    // Вычисление контрольной цифры
    int oddSum = 0;
    int evenSum = 0;
    for (int i = 0; i < 15; i++) {
      int digit = Character.getNumericValue(policyNumber.charAt(i));
      if ((i + 1) % 2 == 0) { // Четные цифры
        evenSum += digit;
      } else { // Нечетные цифры
        oddSum += 2 * digit;
        if (digit >= 5) {
          oddSum -= 9;
        }
      }
    }
    int controlDigit = (10 - ((oddSum + evenSum) % 10)) % 10;
    policyNumber.append(controlDigit);

    return policyNumber.toString();
  }
