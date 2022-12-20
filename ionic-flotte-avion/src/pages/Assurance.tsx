import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar,IonSlides,IonSlide,IonButton } from '@ionic/react';
import ListeAssurance from '../components/ListeAssurance';
import './Home.css';

const slideOpts={
  initialSlide:0,
  speed:400
};
const Assurance: React.FC = () => {
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
          <IonTitle>Assurance</IonTitle>
          <IonButton  href="http://localhost:8100/">Liste des avions</IonButton>
        </IonToolbar>
      </IonHeader>
      <IonContent fullscreen>
        <IonHeader collapse="condense">
          <IonToolbar>
            <IonTitle size="large">Blank</IonTitle>
          </IonToolbar>
        </IonHeader>
            <IonSlides pager={true} options={slideOpts} mode={"ios"}>
                  <IonSlide>
                      <ListeAssurance filtre={1} />
                  </IonSlide>
            
                  <IonSlide>
                      <ListeAssurance filtre={3} />
                  </IonSlide>
            </IonSlides>
      </IonContent>
    </IonPage>
  );
};

export default Assurance;
