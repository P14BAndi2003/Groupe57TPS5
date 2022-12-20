import {IonGrid,IonCol,IonRow, IonCard, IonCardTitle, IonItem, IonCardHeader} from '@ionic/react';
import getData from './GetData';
import React from 'react';


interface ListeAssurance{
  filtre:any;
}


const ListeAssurance:React.FC<ListeAssurance>= ({filtre}) => {
    const{data,error}=getData("/Assurance?filtre="+filtre,"get",null);
   

    return(
        <div className="cont">
            <IonCard>
             
                    <IonCardHeader>
                    Expiration dans {filtre} mois
                    </IonCardHeader>
            <IonGrid>
                <IonRow>
                    <IonCol>Marque</IonCol>
                    <IonCol>Immatriculation</IonCol>
                    <IonCol>Expiration assurance</IonCol>
                </IonRow>  
                {Array.isArray(data) ? data.map(vhc=>(
                <IonRow>
                    <IonCol>{vhc.marque.marque}</IonCol>
                    <IonCol>{vhc.immatriculation}</IonCol>
                    <IonCol>{vhc.assuranceF}</IonCol>
                </IonRow>
                ))
            :"pas de vehicule"}  
            </IonGrid> 
            </IonCard>   
        
              
       
        </div>
    );

};
export default ListeAssurance;