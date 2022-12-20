import getData from './GetData';
import {IonGrid,IonCol,IonRow, IonCard,IonCardHeader, IonList, IonItem, IonLabel} from '@ionic/react';
interface kilometrageinfo{}
const Kilometrage:React.FC<kilometrageinfo>= ()=>{

    
    const queryparams=new URLSearchParams(window.location.search);
    const idV=queryparams.get('idv');
    const url="/inforay?idA="+idV;
    const{data,error}=getData(url,"get",null);
    


    return (
        
        <div className="container">
        <IonCard>
            <IonCardHeader>Historique de kilometrage</IonCardHeader>
                <IonList>
                    <IonItem>
                            <IonLabel>Immatriculation</IonLabel>
                            <IonLabel>date</IonLabel>
                            <IonLabel>km parcourue</IonLabel>
                   </IonItem>
                
                {Array.isArray(data) ? data.map(item=>(
                    <IonItem>
                            <IonLabel>{item.avion.immatriculation}</IonLabel>
                            <IonLabel>{item.date}</IonLabel>
                            <IonLabel>{item.fin-item.debut} km</IonLabel>
                    </IonItem>  
                
                ))
        
                :"Pas de vehicules"}
                </IonList>
        </IonCard>
       </div>
      );

};
export default Kilometrage;