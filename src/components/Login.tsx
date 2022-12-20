import { IonButton } from '@ionic/react';
import { IonInput, IonItem, IonLabel, IonList } from '@ionic/react';
import React from 'react';
import state, { useEffect, useState } from 'react';
import getData from './GetData';
import axios from "axios";
import { Redirect } from 'react-router';

interface Formulaire_log{}

const Login:React.FC<Formulaire_log>= () => {
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [token, setToken] = useState("");
    const queryparams=new URLSearchParams(window.location.search);
    const idV=queryparams.get('idv');
    var url=""
    
    var i=0;
        function log(){
            let url="/login?nom="+username+"&mdp="+password;
            console.log(url);
            const api=axios.create({
                baseURL:"http://localhost:8080",
            });
            api.get(url)
                .then((res)=>{setToken(res.data)});
                console.log(token);
                i=i+1;
                if(token==""){
                    alert("recliquez");
                }
                else if((token==null)){
                    alert("mot de passe incorrect");
                }
                else{
                    localStorage.setItem("token",token);
                    alert("Vous etes connectez");
                    if(idV==null){
                        url="http://localhost:8100/";
                    }
                    else{
                        url="http://localhost:8100/infokm?idv="+idV;
                    }

                    window.location.replace(url);
                }
           
            
        };
        // const tolog=()=>{
        //     let url="/login?nom="+username+"&mdp="+password;
        //     const api=axios.create({
        //         baseURL:"http://localhost:8080",
        //     });
        //     api.get(url)
        //         .then((res)=>{setToken(res.data)});
        //         console.log(token);
        // };
       
    return(
        <div className="container">
            <form>
             <IonList>
                <IonItem>
                    <IonLabel position='stacked'>Nom</IonLabel>
                    <IonInput required name='nom'placeholder='test' onIonChange={(e:any)=>setUsername(e.target.value)}></IonInput>
                </IonItem>
                <IonItem>
                    <IonLabel position='stacked'>Mdp</IonLabel>
                    <IonInput required name='mdp' placeholder='test' onIonChange={(e:any)=>setPassword(e.target.value)}></IonInput>

                </IonItem>
                
                    <IonButton disabled={false} expand="block" onClick={log}>Se Connecter</IonButton>
                
            </IonList>
            </form>
        </div>
    );

};
export default Login;