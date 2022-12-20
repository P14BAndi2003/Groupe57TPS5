import getData from './GetData';
import {IonGrid,IonCol,IonRow, IonCard,IonCardHeader, IonList, IonItem, IonLabel, IonContent, IonButtons,IonButton} from '@ionic/react';
interface Avioninfo{}
const Avioninfo:React.FC<Avioninfo>= ()=>{

    
    const queryparams=new URLSearchParams(window.location.search);
    const idV=queryparams.get('idv');
    const url="/inforay?idA="+idV;
    const{data,error}=getData(url,"get",null);
    var numero="";
    var photo="";
    var mrq="";
    var nbp=0;
    data.map(item=>{
        numero=item.avion.immatriculation
        nbp=item.avion.nbplace
        mrq=item.avion.marque.marque
        photo=item.avion.photo
    
    })
    

    return (
        
        <div className="co">
            
                <IonCard>
                <IonItem> {photo}</IonItem>
                    <IonItem>
                    <b>Immatriculation : </b>{numero}</IonItem>
                    <IonItem><b>Nombre de places : </b>{nbp} </IonItem>
                    <IonItem><b>Modèle : </b> {mrq}</IonItem>
                    
                   
                </IonCard>
                
       </div>
      );

};
export default Avioninfo;