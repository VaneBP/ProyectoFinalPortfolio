import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Educacion } from '../Model/educacion';

@Injectable({
  providedIn: 'root'
})
export class EducacionService {
  //URL = 'http://localhost:8080/educacion/'
  URL = 'https://proyectofinalvane.herokuapp.com/educacion/'

  constructor(private hhtpClient : HttpClient) { }

  public lista(): Observable<Educacion[]>{
    return this.hhtpClient.get<Educacion[]>(this.URL + 'lista');
  }

  public detail(id: number): Observable<Educacion>{
    return this.hhtpClient.get<Educacion>(this.URL + `detail/${id}`);
  }

  public save(educacion: Educacion): Observable<any>{
    return this.hhtpClient.post<any>(this.URL + 'create', educacion);
  }

  public update(id: number, educacion: Educacion): Observable<any>{
    return this.hhtpClient.put<any>(this.URL + `update/${id}`, educacion);
  }

  public delete(id: number): Observable<any>{
    return this.hhtpClient.delete<any>(this.URL + `delete/${id}`);
  }
}
