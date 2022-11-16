export type Name = {
  firstName: string;
  lastName: string
}

export type Publication = {
  name: string;
  description: string;
  authors: Name[];
  year: number;
}
