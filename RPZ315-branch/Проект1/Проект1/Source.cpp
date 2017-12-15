#include <iostream>
#include <ctime>
#include <iomanip>
using namespace std;

void main()
{
	int qog, temp = 0, qoc = 0; srand(time(0));
	cout << "Enter the quantity of groups: "; cin >> qog;
	int *arr = new int[7 * qog];
	for (int i = 0; i < 7 * qog; i++)
		arr[i] = rand() % rand() % 2;
	for (int i = 0; i < qog; i++)
	{
		cout << "Group number " << setw(3) << i + 1 << ": ";
		for (int j = i * 7; j < i * 7 + 7; j++)	cout << arr[j];
		cout << ";\n";
	}
	for (int i = 0; i < 7; i++)
	{
		for (int j = 0; j < qog; j++) temp += arr[i + j * 7];
		if (temp > qoc) qoc = temp;
		temp = 0;
	}
	cout << qoc << " classroms are need to held the classes\n";
	system("pause");
}