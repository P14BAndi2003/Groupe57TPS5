import { Console } from 'console';
import './ExploreContainer.css';
import React, { useEffect, useState } from 'react';
import * as $ from "jquery"
import getData from './GetData';
import Login from './Login';
import { IonButton, IonCol, IonGrid, IonItem, IonLabel, IonList, IonRow } from '@ionic/react';

interface listeV { }

     

const ListeVehicule: React.FC<listeV> = () => {
  
    const{data,error}=getData("/Avions","get",null);
    var url="http://localhost:8100/login?idv=";
   
    if(localStorage.getItem("token")){
      url="http://localhost:8100/infokm?idv="
      setTimeout(() => {
        localStorage.removeItem("token");
        alert("Veuillez vous reconnectez");
        window.location.href="http://localhost:8100/login";
      },6000000);
      
    }
 
    

  
   return (
    
    <div className="container">
      
      <IonList>
     {Array.isArray(data) ? data.map(item=>(
    
            <IonItem>
                    <IonLabel>{item.marque.marque}</IonLabel>
           
            
                    <IonLabel> {item.immatriculation}</IonLabel>
            
  
                    <IonLabel><IonButton fill="outline" size='small' href={url+item.idAvion}>Voir details km</IonButton></IonLabel>
             </IonItem>
      ))
    
    :"Pas de vehicules"}
   
    </IonList>

    </div>
   
  );
};

export default ListeVehicule;
