import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar,IonButton } from '@ionic/react';
import ListeAvion from '../components/ListeAvion';
import Login from '../components/Login';
import './Home.css';

const Liste: React.FC = () => {
  return (
    <IonPage>
      <IonHeader>
        <IonToolbar>
          <IonTitle>Liste des Avions</IonTitle>
          <IonButton  href="http://localhost:8100/assurance">Verifier les assurances</IonButton>
        </IonToolbar>
      </IonHeader>
      <IonContent fullscreen>
        <IonHeader collapse="condense">
          <IonToolbar>
            <IonTitle size="large">Blank</IonTitle>
          </IonToolbar>
        </IonHeader>
        <ListeAvion />
      
      </IonContent>
    </IonPage>
  );
};

export default Liste;
