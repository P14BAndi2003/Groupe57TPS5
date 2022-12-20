import { IonButton, IonContent, IonHeader, IonMenuButton, IonPage, IonTitle, IonToolbar } from '@ionic/react';
import Kilometrage from '../components/Kilometrage';
import Info from '../components/Details';
import './Home.css';

const Liste: React.FC = () => {
  if(localStorage.getItem("token")){
    setTimeout(() => {
      localStorage.removeItem("token");
      alert("Veuillez vous reconnectez");
      window.location.href="http://localhost:8100/login";
    },6000000);
  }
  else{
    alert("Veuillez vous reconnectez");
      window.location.href="http://localhost:8100/login";
  }
  return (
    <IonPage>
      <IonHeader>
        <IonToolbar>
          <IonTitle>Acceuil</IonTitle>
          <IonButton  href="http://localhost:8100/assurance">Verifier les assurances</IonButton>
        </IonToolbar>
      </IonHeader>
      <IonContent fullscreen>
        <Info/>
        <Kilometrage />
   
      </IonContent>
    </IonPage>
  );
};

export default Liste;
