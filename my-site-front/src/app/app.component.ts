import {Component, OnInit} from '@angular/core';
import {Publication} from "./utils";
import {Apollo, gql} from "apollo-angular";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title: string = 'Name';
  publications: Publication[] = []

  constructor(private apollo: Apollo) {}

  ngOnInit(): void {
    this.apollo.watchQuery<{articles: Publication[]}>({
      query: gql`
        query {
          articles {
            name
            description
            authors {
              firstName
              lastName
            }
            year
          }
        }
      `
    })
    .valueChanges.subscribe({
      next: value => this.publications = value.data.articles,
      error: err => console.error(err),
      complete: () => console.log("DONE")
    })
  }



}
