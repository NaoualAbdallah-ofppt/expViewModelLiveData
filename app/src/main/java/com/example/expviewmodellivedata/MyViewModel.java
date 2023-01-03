package com.example.expviewmodellivedata;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class MyViewModel extends ViewModel {
    MutableLiveData<String> data1 = new MutableLiveData<String>();
    public void setData1(String valeur) {
        data1.postValue(valeur);
        data1.setValue(valeur);
    }
//  MutableLiveData<String> data1;
    //MutableLiveData<List<Integer>> lstDataInt;
    // public LiveData<String> getNom() {
    //    LiveData<String> S =null;
//

    //  return S;

    //}
   /* public LiveData<List<Integer>> getNombres() {
        LiveData<List<Integer>> lst =null;
//

        return lst;
*/

}
