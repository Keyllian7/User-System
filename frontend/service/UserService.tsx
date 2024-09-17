import axios from "axios";

export const axiosInstance = axios.create({
    baseURL: "http://localhost:8080"
})

export class UserService{
    listAll(){
    return axiosInstance.get("/user");
    }
    insert(user : Projeto.User){
        return axiosInstance.post("/user", user)
    }
    update(user : Projeto.User){
        return axiosInstance.put("/user", user)
    }
    delete(id : number){
        return axiosInstance.delete("/user/" + id)
    }
}