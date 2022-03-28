export interface CapacitorZipPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  unzip(options: {
    source: string;
    destination: string;
  }): Promise<{ result: boolean; message: string; uri: string }>;
}
