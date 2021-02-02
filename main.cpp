#include <iostream>
#include <string>

void cetak(std::string inputValue)
{
    std::cout << "Pilihan Anda Adalah : " << inputValue << std::endl;
}

void wrong(std::string inputValue)
{
    std::cout << "Anda Tidak Memasukan Kata Apapun" << std::endl;
}

int main()
{
    int x = 50;
    int y = 10;

    int c;

    c = 50 / 10;

    std::cout << "Hasilnya adalah =" << c;

    std::string inputValue;

    std::cout << "What Your Phone System? (Apple Or Android) : ";
    std::getline(std::cin, inputValue);

    if (inputValue == "Apple" || inputValue == "APPLE" || inputValue == "apple")
    {
        cetak(inputValue);
    }
    else if (inputValue == "Android" || inputValue == "ANDROID" || inputValue == "android")
    {
        cetak(inputValue);
    }
    else
    {
        wrong(inputValue);
    }

    std::cin.get();
    return 0;
}