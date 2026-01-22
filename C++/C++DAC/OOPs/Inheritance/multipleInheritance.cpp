#include<iostream>
using namespace std;

class LandVehicle {
    public:
    void landInfo() {
        cout << "This is a LandVehicle" << endl;
    }
};


class WaterVehicle {
    public:
    void waterInfo() {
        cout << "This is a WaterVehicle" << endl;
    }
};


class AmphibiousVehicle : public LandVehicle, public WaterVehicle {
    public:
    AmphibiousVehicle() {
        cout << "This is a AmphibiousVehicle" << endl;
    }
};


int main() {
    AmphibiousVehicle obj;
    obj.waterInfo();
    obj.landInfo();


    return 0;
}